package race.view;

public class ResultView {
    private static final String EXECUTION = "\n실행 결과";
    private static final String ROUND_SEPARATION = "\n";

    public void printResultView() {
        System.out.println(EXECUTION);
    }

    public void separateRound() {
        System.out.println(ROUND_SEPARATION);
    }

    public void printCarLocation(int location) {
        for (int i = 0; i < location; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

}