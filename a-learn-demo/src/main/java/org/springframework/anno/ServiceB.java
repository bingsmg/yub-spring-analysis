package org.springframework.anno;

/**
 * @author weibb
 * @date 2023-07-17
 */
public class ServiceB {

    private ServiceA serviceA;

    public ServiceB(ServiceA serviceA) {
        this.serviceA = serviceA;
    }

    @Override
    public String toString() {
        return "ServiceB{" +
                "serviceA=" + serviceA + "}";
    }
}
