package Models;

import Services.ManagerService;

public class Manager extends Staff implements ManagerService {
//    public Manager(){
//    }
    public Manager(String name, String staffId, String role) {
        super(name, staffId, role);
    }

    @Override
    public String getName() {
        return super.getName();
    }
    @Override
    public String getStaffId() {
        return super.getStaffId();
    }
    @Override
    public String getRole() {
        return super.getRole();
    }
    @Override
    public String hireCashier(Applicant applicant) {
        if(applicant.getTestScore() >= 50 /*|| applicant.getTestScore() <= 100*/){
            return "Congratulations! You have been hired as our new cashier.";
        }else{
            return "Sorry, you have not been hired. " +
                    "However, the experience you have gained would help you reach the ace in your next interview.";
        }
    }
}
