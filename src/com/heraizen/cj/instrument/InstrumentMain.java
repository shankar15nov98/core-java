package com.heraizen.cj.instrument;

public class InstrumentMain {
	public static void main(String[] arg) {
		Instrument instrumentArr[] = new Instrument[10];
		for (int i = 0; i < 10; i++) {

			if (i == 2 || i == 4 || i == 6) {
				instrumentArr[i] = new Piano();
			}

			else if (i == 1 || i == 3 || i == 5) {
				instrumentArr[i] = new Flute();
			}

			else {

				instrumentArr[i] = new Guitar();

			}

		}

		for (Instrument instrument : instrumentArr) {
			instrument.play();
		}

	}
}
