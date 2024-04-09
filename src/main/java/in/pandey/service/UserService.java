package in.pandey.service;

import in.pandey.bindings.DashboardCard;
import in.pandey.bindings.LoginForm;
import in.pandey.bindings.UserAccForm;

public interface UserService {

    public String login(LoginForm loginForm);

    public boolean recoverPwd(String email);

    public DashboardCard fetchDashboardInfo();
    
    public UserAccForm getUserByEmail(String email);

}
