package race;

import race.util.InputUtils;
import race.vehicle.Cars;
import race.view.ResultView;

public class Start {
    public static void main(String[] args) {
        Cars cars = new Cars(InputUtils.inputCarView());
        ResultView resultView = new ResultView();
        PlayGame play = new PlayGame(cars.getCars(),resultView);
        play.gameStart(InputUtils.inputMoveView());
    }

}