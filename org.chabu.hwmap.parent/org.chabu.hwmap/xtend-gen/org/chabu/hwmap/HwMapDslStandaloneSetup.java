/**
 * generated by Xtext 2.19.0
 */
package org.chabu.hwmap;

import org.chabu.hwmap.HwMapDslStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class HwMapDslStandaloneSetup extends HwMapDslStandaloneSetupGenerated {
  public static void doSetup() {
    new HwMapDslStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
