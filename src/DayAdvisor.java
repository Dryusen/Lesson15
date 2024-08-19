public class DayAdvisor implements Advisor{
    @Override
    public void advise(Day day) {
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("Плануйте свій день заздалегідь і не забувайте робити перерви!");
                break;
            case FRIDAY:
                System.out.println("Happy Friday!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Вихідні! Ви можете відвідати парк, музей або прогулятися на природі.");
                break;
        }
    }
}
