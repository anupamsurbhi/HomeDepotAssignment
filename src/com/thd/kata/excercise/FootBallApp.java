package com.thd.kata.excercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.thd.kata.excercise.util.Utilities;

public class FootBallApp {

	public static void main(String... args) throws Exception {

		processFootBallFile("../HomeDepotAssignment/resource/football.dat");

	}

	public static void processFootBallFile(String fileName) throws Exception {
		String minTeamName = "NA";
		Integer minTeamVariance = 0;

		String team = null;
		Integer teamVariance = 0;

		Utilities util = new Utilities();

		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(fileName));
			String line = reader.readLine();
			while (line != null) {

				if (!line.substring(4, 5).equals(" ") && util.isNumeric(line.substring(4, 5))) {

					team = line.substring(7, 23);
					teamVariance = util.abcVariance(line.substring(43, 45), line.substring(50, 52));

					if (minTeamName.equals("NA")) {
						minTeamVariance = teamVariance;
						minTeamName = team;
					} else {
						if (minTeamVariance > teamVariance) {
							minTeamVariance = teamVariance;
							minTeamName = team;
						}

					}
				}
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(
				"the Team :" + minTeamName + " has the minimim goal difference i.e. " + minTeamVariance + " goals");

	}

}
