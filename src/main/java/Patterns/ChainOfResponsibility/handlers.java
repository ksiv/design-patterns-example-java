package Patterns.ChainOfResponsibility;

class customHandler implements Ihandler{

    @Override
    public String handle(Passenger passenger) {
        if(passenger.getLuggage().equals("ok")){
            return new boardingHandler().handle(passenger);
        }else {
            return "stuck on custom";
        }
    }
}

class immigrationHandler implements Ihandler{

    @Override
    public String handle(Passenger passenger) {
        if(passenger.getPassport().equals("ok")){
            return new customHandler().handle(passenger);
        }else {
            return "identity or visa problem";
        }
    }
}

class airlineHandler implements Ihandler{

    @Override
    public String handle(Passenger passenger) {
        if(passenger.getTicket().equals("ok")){
            return new immigrationHandler().handle(passenger);
        }else {
            return "failed to get boarding gard";
        }
    }
}

class boardingHandler implements Ihandler{

    @Override
    public String handle(Passenger passenger) {
        return "bon voyage";
    }
}
class startHandler implements Ihandler{

    @Override
    public String handle(Passenger passenger) {
        return new airlineHandler().handle(passenger);
    }
}
