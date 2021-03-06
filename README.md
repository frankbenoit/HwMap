# HwMap
Tool to define the memory interface between memory mapped hardware and C code

To install this Eclipse plugin, use this link as the update site: https://raw.githubusercontent.com/frankbenoit/HwMap.p2/master/repository

The user writes a description (.hwmap) of the memory addresses and registers, that will build the API between an FPGA design and the C code accessing it.

This .hwmap file can also be seen as a documentation.
The HwMap tool reads that file and generates C-Header and VHDL-packages from it. Those can then be used in the code on both sides to ensure consistency.

In addition HwMap comes with an Eclipse editor, which let's you edit the .hwmap with validation and some content assist functionality.

Example files:

````
Output C    "../../C-Code/includes/MyHardware.h"
Output VHDL "../../FPGA/pcore/mycore_v1_00_a/hdl/vhdl/my_hardware.vhd"

Component MyHardware 0x10000 {

  Block Regs 0x100 {
    0x00 ModuleAndVersion
      [ 7 ..  0] Version
                  Constant 0x03 CurrentVersion
      [31 ..  8] Module_ID
                  Constant 0x123456 ID
                  
    // Control is a write-only register. On read always zero-vector will be returned.
    0x04 Control
      [       0] Enable
      [       1] IRQ_Enable
      [ 7 ..  3] State_Command
                  Constant 0 Nothing
                  Constant 1 StartSimulation
                  Constant 2 StopSimulation
                  Constant 3 ClearMemory
      
    0x08 Status
      [       0] Enabled
      [       1] IRQ_Enabled
      [       2] IRQ_Pending
      
    0x0C Baudrate
      // cycles @50MHz needed for 1 bit
      Constant   50 Rate_1MBit
      Constant  500 Rate_100KBit
      Constant 1000 Rate_50KBit
  }
  Block Channel 0x100 {
    0x00 Control
    0x04 Status
  }
  Block TraceMem 0x1000 {
  }
  
  0x0000 Regs    Registers
  0x0400 Channel Channel_0
  0x0500 Channel Channel_1
  0x0600 Channel Channel_2
  0x0700 Channel Channel_3
  0x4000 TraceMem TraceMem
}
````

Running the standlone generator like this...
````
C:\C5\HwMap>java -jar hwmap.jar C:\C5\HwMap\example\sub1\sub2\myhw.hwmap
Output directory: C:\C5\HwMap\example\sub1\sub2
Write C header: ../../C-Code/includes/MyHardware.h
Write VHDL package: ../../FPGA/pcore/mycore_v1_00_a/hdl/vhdl/my_hardware_package.vhd
Code generation finished.

C:\C5\HwMap>
````

Here the generated C header file...
````
// generated by HwMap : https://github.com/frankbenoit/HwMap
#ifndef MYHARDWARE_H
#define MYHARDWARE_H

#define MyHardware_Regs_ModuleAndVersion_Version_BITPOS 0
#define MyHardware_Regs_ModuleAndVersion_Version_WIDTH 8
#define MyHardware_Regs_ModuleAndVersion_Version_MASK 0xFF
#define MyHardware_Regs_ModuleAndVersion_Version_CONST_CurrentVersion 0x3
#define MyHardware_Regs_ModuleAndVersion_Module_ID_BITPOS 8
#define MyHardware_Regs_ModuleAndVersion_Module_ID_WIDTH 24
#define MyHardware_Regs_ModuleAndVersion_Module_ID_MASK 0xFFFFFF00
#define MyHardware_Regs_ModuleAndVersion_Module_ID_CONST_ID 0x123456
#define MyHardware_Regs_Control_Enable_BITPOS 0
#define MyHardware_Regs_Control_Enable_WIDTH 1
#define MyHardware_Regs_Control_Enable_MASK 0x1
#define MyHardware_Regs_Control_IRQ_Enable_BITPOS 1
#define MyHardware_Regs_Control_IRQ_Enable_WIDTH 1
#define MyHardware_Regs_Control_IRQ_Enable_MASK 0x2
#define MyHardware_Regs_Control_State_Command_BITPOS 3
#define MyHardware_Regs_Control_State_Command_WIDTH 5
#define MyHardware_Regs_Control_State_Command_MASK 0xF8
#define MyHardware_Regs_Control_State_Command_CONST_Nothing 0x0
#define MyHardware_Regs_Control_State_Command_CONST_StartSimulation 0x1
#define MyHardware_Regs_Control_State_Command_CONST_StopSimulation 0x2
#define MyHardware_Regs_Control_State_Command_CONST_ClearMemory 0x3
#define MyHardware_Regs_Status_Enabled_BITPOS 0
#define MyHardware_Regs_Status_Enabled_WIDTH 1
#define MyHardware_Regs_Status_Enabled_MASK 0x1
#define MyHardware_Regs_Status_IRQ_Enabled_BITPOS 1
#define MyHardware_Regs_Status_IRQ_Enabled_WIDTH 1
#define MyHardware_Regs_Status_IRQ_Enabled_MASK 0x2
#define MyHardware_Regs_Status_IRQ_Pending_BITPOS 2
#define MyHardware_Regs_Status_IRQ_Pending_WIDTH 1
#define MyHardware_Regs_Status_IRQ_Pending_MASK 0x4
#define MyHardware_Regs_Baudrate_CONST_Rate_1MBit 0x32
#define MyHardware_Regs_Baudrate_CONST_Rate_100KBit 0x1F4
#define MyHardware_Regs_Baudrate_CONST_Rate_50KBit 0x3E8

struct MyHardware_Regs {
    uint32 ModuleAndVersion;
    uint32 Control;
    uint32 Status;
    uint32 Baudrate;
    uint32 __dummy_0[0x3C];
}

struct MyHardware_Channel {
    uint32 Control;
    uint32 Status;
    uint32 __dummy_0[0x3E];
}

struct MyHardware_TraceMem {
    uint32 __dummy_0[0x400];
}

struct MyHardware {
    struct MyHardware_Regs Registers;
    uint32 __dummy_0[0xC0];
    struct MyHardware_Channel Channel_0;
    struct MyHardware_Channel Channel_1;
    struct MyHardware_Channel Channel_2;
    struct MyHardware_Channel Channel_3;
    uint32 __dummy_1[0xE00];
    struct MyHardware_TraceMem TraceMem;
}

#endif
````

In the C software, a base pointer must be casted to `struct MyHardware*`, then the addresses of the registers can be accessed.  
````
struct MyHardware* hw = (struct MyHardware*)0x12340000ULL;
HwOut32( &hw->Registers.Control, 0x123 );
````
Those fields could be marked as volatile and access them directly. But it was seen by compiler optimization,
that those accesses are not guaranteed to be then same then. 
Better to get the address and use a macro/function to access the hardware register.

Here the VHDL package file...

````
-- generated by HwMap : https://github.com/frankbenoit/HwMap
library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

package my_hardware_pck is

  constant MyHardware_Regs_ModuleAndVersion_Version_BITPOS : integer := 0;
  constant MyHardware_Regs_ModuleAndVersion_Version_WIDTH : integer := 8;
  constant MyHardware_Regs_ModuleAndVersion_Version_MASK : std_logic_vector( 7 downto 0 ) := CONV_STD_LOGIC_VECTOR( 16#FF#, 8 );
  constant MyHardware_Regs_ModuleAndVersion_Version_CONST_CurrentVersion : std_logic_vector( 7 downto 0 ) := CONV_STD_LOGIC_VECTOR( 16#3#, 8 );
  constant MyHardware_Regs_ModuleAndVersion_Module_ID_BITPOS : integer := 8;
  constant MyHardware_Regs_ModuleAndVersion_Module_ID_WIDTH : integer := 24;
  constant MyHardware_Regs_ModuleAndVersion_Module_ID_MASK : std_logic_vector( 23 downto 0 ) := CONV_STD_LOGIC_VECTOR( 16#FFFFFF00#, 24 );
  constant MyHardware_Regs_ModuleAndVersion_Module_ID_CONST_ID : std_logic_vector( 23 downto 0 ) := CONV_STD_LOGIC_VECTOR( 16#123456#, 24 );
  constant MyHardware_Regs_Control_Enable_BITPOS : integer := 0;
  constant MyHardware_Regs_Control_Enable_WIDTH : integer := 1;
  constant MyHardware_Regs_Control_Enable_MASK : std_logic_vector( 0 downto 0 ) := CONV_STD_LOGIC_VECTOR( 16#1#, 1 );
  constant MyHardware_Regs_Control_IRQ_Enable_BITPOS : integer := 1;
  constant MyHardware_Regs_Control_IRQ_Enable_WIDTH : integer := 1;
  constant MyHardware_Regs_Control_IRQ_Enable_MASK : std_logic_vector( 0 downto 0 ) := CONV_STD_LOGIC_VECTOR( 16#2#, 1 );
  constant MyHardware_Regs_Control_State_Command_BITPOS : integer := 3;
  constant MyHardware_Regs_Control_State_Command_WIDTH : integer := 5;
  constant MyHardware_Regs_Control_State_Command_MASK : std_logic_vector( 4 downto 0 ) := CONV_STD_LOGIC_VECTOR( 16#F8#, 5 );
  constant MyHardware_Regs_Control_State_Command_CONST_Nothing : std_logic_vector( 4 downto 0 ) := CONV_STD_LOGIC_VECTOR( 16#0#, 5 );
  constant MyHardware_Regs_Control_State_Command_CONST_StartSimulation : std_logic_vector( 4 downto 0 ) := CONV_STD_LOGIC_VECTOR( 16#1#, 5 );
  constant MyHardware_Regs_Control_State_Command_CONST_StopSimulation : std_logic_vector( 4 downto 0 ) := CONV_STD_LOGIC_VECTOR( 16#2#, 5 );
  constant MyHardware_Regs_Control_State_Command_CONST_ClearMemory : std_logic_vector( 4 downto 0 ) := CONV_STD_LOGIC_VECTOR( 16#3#, 5 );
  constant MyHardware_Regs_Status_Enabled_BITPOS : integer := 0;
  constant MyHardware_Regs_Status_Enabled_WIDTH : integer := 1;
  constant MyHardware_Regs_Status_Enabled_MASK : std_logic_vector( 0 downto 0 ) := CONV_STD_LOGIC_VECTOR( 16#1#, 1 );
  constant MyHardware_Regs_Status_IRQ_Enabled_BITPOS : integer := 1;
  constant MyHardware_Regs_Status_IRQ_Enabled_WIDTH : integer := 1;
  constant MyHardware_Regs_Status_IRQ_Enabled_MASK : std_logic_vector( 0 downto 0 ) := CONV_STD_LOGIC_VECTOR( 16#2#, 1 );
  constant MyHardware_Regs_Status_IRQ_Pending_BITPOS : integer := 2;
  constant MyHardware_Regs_Status_IRQ_Pending_WIDTH : integer := 1;
  constant MyHardware_Regs_Status_IRQ_Pending_MASK : std_logic_vector( 0 downto 0 ) := CONV_STD_LOGIC_VECTOR( 16#4#, 1 );
  constant MyHardware_Regs_Baudrate_CONST_Rate_1MBit : std_logic_vector( 31 downto 0 ) := CONV_STD_LOGIC_VECTOR( 16#32#, 32 );
  constant MyHardware_Regs_Baudrate_CONST_Rate_100KBit : std_logic_vector( 31 downto 0 ) := CONV_STD_LOGIC_VECTOR( 16#1F4#, 32 );
  constant MyHardware_Regs_Baudrate_CONST_Rate_50KBit : std_logic_vector( 31 downto 0 ) := CONV_STD_LOGIC_VECTOR( 16#3E8#, 32 );
  type Block_MyHardware_Regs_Selection is record
    UnmappedSelection : std_logic;
    Selected_ModuleAndVersion : std_logic;
    Selected_Control : std_logic;
    Selected_Status : std_logic;
    Selected_Baudrate : std_logic;
  end record;

  type Block_MyHardware_Channel_Selection is record
    UnmappedSelection : std_logic;
    Selected_Control : std_logic;
    Selected_Status : std_logic;
  end record;

  type Block_MyHardware_TraceMem_Selection is record
    UnmappedSelection : std_logic;
  end record;

  type Comp_MyHardware_Selection is record
    Block_Regs : Block_MyHardware_Regs_Selection;
    Block_Channel : Block_MyHardware_Channel_Selection;
    Block_TraceMem : Block_MyHardware_TraceMem_Selection;
    UnmappedSelection : std_logic;
    Selected_Registers : std_logic;
    Selected_Channel_0 : std_logic;
    Selected_Channel_1 : std_logic;
    Selected_Channel_2 : std_logic;
    Selected_Channel_3 : std_logic;
    Selected_TraceMem : std_logic;
  end record;

end package my_hardware_pck;

library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

entity my_hardware_Decoder_MyHardware is
  Port (
    addr  : in std_logic_vector( 15 downto 0 );
    cycle : in std_logic;
    selection : out work.my_hardware_pck.Comp_MyHardware_Selection );
end out_Decoder_CapSim;

architecture Behavioral of my_hardware_Decoder_MyHardware is
  signal res : work.my_hardware_pck.Comp_MyHardware_Selection;
begin
  selection <= res;
  res.UnmappedSelection <= '1' when
    res.Selected_Registers = '0' and
    res.Selected_Channel_0 = '0' and
    res.Selected_Channel_1 = '0' and
    res.Selected_Channel_2 = '0' and
    res.Selected_Channel_3 = '0' and
    res.Selected_TraceMem = '0' and
    cycle = '1' else '0';
  res.Block_Regs.Selected_ModuleAndVersion <= '1' when
    addr( 7 downto 2 ) = "000000" and
    cycle = '1' else '0';
  res.Block_Regs.Selected_Control <= '1' when
    addr( 7 downto 2 ) = "000001" and
    cycle = '1' else '0';
  res.Block_Regs.Selected_Status <= '1' when
    addr( 7 downto 2 ) = "000010" and
    cycle = '1' else '0';
  res.Block_Regs.Selected_Baudrate <= '1' when
    addr( 7 downto 2 ) = "000011" and
    cycle = '1' else '0';
  res.Block_Regs.UnmappedSelection <= '1' when
    res.Block_Regs.Selected_ModuleAndVersion = '0' and
    res.Block_Regs.Selected_Control = '0' and
    res.Block_Regs.Selected_Status = '0' and
    res.Block_Regs.Selected_Baudrate = '0' and
    cycle = '1' else '0';
  res.Block_Channel.Selected_Control <= '1' when
    addr( 7 downto 2 ) = "000000" and
    cycle = '1' else '0';
  res.Block_Channel.Selected_Status <= '1' when
    addr( 7 downto 2 ) = "000001" and
    cycle = '1' else '0';
  res.Block_Channel.UnmappedSelection <= '1' when
    res.Block_Channel.Selected_Control = '0' and
    res.Block_Channel.Selected_Status = '0' and
    cycle = '1' else '0';
  res.Block_TraceMem.UnmappedSelection <= '1' when
    cycle = '1' else '0';
  res.Selected_Registers <= '1' when
    addr( 15 downto 8 ) = "00000000" and
    cycle = '1' else '0';
  res.Selected_Channel_0 <= '1' when
    addr( 15 downto 8 ) = "00000100" and
    cycle = '1' else '0';
  res.Selected_Channel_1 <= '1' when
    addr( 15 downto 8 ) = "00000101" and
    cycle = '1' else '0';
  res.Selected_Channel_2 <= '1' when
    addr( 15 downto 8 ) = "00000110" and
    cycle = '1' else '0';
  res.Selected_Channel_3 <= '1' when
    addr( 15 downto 8 ) = "00000111" and
    cycle = '1' else '0';
  res.Selected_TraceMem <= '1' when
    addr( 15 downto 12 ) = "0100" and
    cycle = '1' else '0';
end Behavioral;
````
