package Factory;
//工厂接口
public interface BWMFactory {
    BWM productBWM();
}

class BWM3Factory implements BWMFactory{

    @Override
    public BWM productBWM() {
        System.out.println("BWM3 product");
        System.out.println("BWM3i");
        return new BWM3i();
    }
}

class BWM5Factory implements BWMFactory{

    @Override
    public BWM productBWM() {
        System.out.println("BWM5 product");
        return new BWM5();
    }
}

class BWM7Factory implements BWMFactory{

    @Override
    public BWM productBWM() {
        System.out.println("BWM7 product");
        return new BWM7();
    }
}
