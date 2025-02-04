package io.sundr.model;

import java.lang.Boolean;

public interface ModifierSupportFluent<A extends ModifierSupportFluent<A>> extends AttributeSupportFluent<A> {

  public int getModifiers();

  public A withModifiers(int modifiers);

  public Boolean hasModifiers();
}
