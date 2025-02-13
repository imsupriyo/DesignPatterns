package org.example.singleton;

public class RegistryHolder {
    private RegistryHolder(){}

    private static class RegistryHolderInner {
        private static final RegistryHolder INSTANCE = new RegistryHolder();
    }
    public static RegistryHolder getInstance() {
        return RegistryHolderInner.INSTANCE; // lazy initialization
    }
}
class Main {
    public static void main(String[] args) {
        RegistryHolder registryHolder = RegistryHolder.getInstance();
        RegistryHolder registryHolder2 = RegistryHolder.getInstance();
        System.out.println(registryHolder == registryHolder2);
    }
}
