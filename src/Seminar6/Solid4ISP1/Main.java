package Seminar6.Solid4ISP1;

import Seminar6.Solid4ISP1.isp.*;

public class Main {
    public static void main(String[] args) {
        InternetPaymentService internetService = new InternetPaymentService();
        internetService.payWebMoney(10);
        internetService.payCreditCard(10);
        internetService.payPhoneNumber(10);

        System.out.println("====================================");

        TerminalPaymentService terminalService = new TerminalPaymentService();
        terminalService.payWebMoney(10);
        terminalService.payCreditCard(10);
    }
}
