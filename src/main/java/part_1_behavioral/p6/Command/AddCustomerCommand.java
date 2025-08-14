package part_1_behavioral.p6.Command;

import part_1_behavioral.p6.Command.fx.Command;

public class AddCustomerCommand implements Command {

    private CustomerService customerService;

    public AddCustomerCommand(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public void execute() {
        customerService.addCustomer();
    }

}
