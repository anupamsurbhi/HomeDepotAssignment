package com.thd.kata.excercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.thd.kata.excercise.util.Utilities;

public class WeatherApp {

	public static void main(String... args) throws Exception {

		processWeatherFile("../HomeDepotAssignment/resource/weather.dat");

	}

	public static void processWeatherFile(String fileName) throws Exception {
		String minDay = "NA";
		Integer minTempVariance = 0;

		String day = null;
		Integer tempVariance = 0;

		Utilities util = new Utilities();

		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(fileName));
			String line = reader.readLine();
			while (line != null) {

				if (util.isNumeric(line.substring(2, 4))) {

					day = line.substring(2, 4);
					tempVariance = util.abcVariance(line.substring(6, 8), line.substring(12, 14));

					if (minDay.equals("NA")) {
						minTempVariance = tempVariance;
						minDay = day;
					} else {
						if (minTempVariance > tempVariance) {
							minTempVariance = tempVariance;
							minDay = day;
						}

					}
				}
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("the smallest temperature spread day is :" + minDay + "th day and the variance is: " + minTempVariance
				+ " degree");

	}

}
