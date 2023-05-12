package Array;

public class Hospital {
    public int getNoOfPatient(){
        return 0;
    }
}
class Forties extends Hospital{
    @Override
    public int getNoOfPatient() {
        return 100;
    }
}

class Narayana extends Hospital{
    @Override
    public int getNoOfPatient() {
        return 200;
    }
}
class Apollo extends Hospital{
    public int getNoOfPatient() {
        return 300;
    }
}
