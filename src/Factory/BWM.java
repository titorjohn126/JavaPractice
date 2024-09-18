package Factory;

public interface BWM {
    void showInfo();
}

class BWM3i implements BWM{


    @Override
    public void showInfo() {
        System.out.println("BWM3");
    }
}


class BWM5 implements BWM{


    @Override
    public void showInfo() {
        System.out.println("BWM5");
    }
}

class BWM7 implements BWM{


    @Override
    public void showInfo() {
        System.out.println("BWM7");
    }
}