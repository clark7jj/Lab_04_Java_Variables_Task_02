//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
double springCosts = 20.00;
double summerCosts = 30.00;
double fallCosts = 25.00;
double winterCosts = 15.00;

double totalYearlyCosts = springCosts + summerCosts + fallCosts + winterCosts;

System.out.println("Your Spring Costs were:$ " + springCosts);
System.out.println("Your Summer Costs were:$ " + summerCosts);
System.out.println("Your Fall Costs were:$ " + fallCosts);
System.out.println("Your Winter Costs were:$ " + winterCosts);
System.out.println("Your Total Yearly Costs are:$ " + totalYearlyCosts);


    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));

    for (int i = 1; i <= 5; i++) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        IO.println("i = " + i);
    }
}
