package com.Generics;

import com.InterfacesExamples.League;

public class Demo {
	
	public static void main (String [] args) {
		FootballPlayer joe = new FootballPlayer("JOE");
		BaseballPlayer pat = new BaseballPlayer("Pat");
		SoccerPlayer beckham = new SoccerPlayer("Beckham");
		
		Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
		adelaideCrows.addPlayer(joe);
//		adelaideCrows.addPlayer(pat);
//		adelaideCrows.addPlayer(beckham);
		
		Team<FootballPlayer> adelaide = new Team<>("Adelaide Champs");
		adelaideCrows.addPlayer(new FootballPlayer("Jake"));
		
		System.out.println(adelaideCrows.numPlayers());
		
		Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
		baseballTeam.addPlayer(pat);
		
		Team<SoccerPlayer> brokenTeam = new Team<>("This will not work only after the Upper bound");
		brokenTeam.addPlayer(beckham);
		
		//The method matchResult(Team<FootballPlayer>, int, int) in the type Team<FootballPlayer> 
		//is not applicable for the arguments (Team<BaseballPlayer>, int, int)
		// Here is an example of a broken team
		
		//adelaideCrows.matchResult(baseballTeam, 100, 20);
		
		adelaideCrows.matchResult(adelaide, 20, 100);
		adelaideCrows.matchResult(adelaide, 20, 100);
		adelaideCrows.matchResult(adelaide, 20, 100);
		adelaideCrows.matchResult(adelaide, 120, 100);
		
		System.out.println(adelaideCrows.getName() +": " + adelaideCrows.ranking());
		System.out.println(adelaide.getName() +": " + adelaide.ranking());
		
		
		
		
		League<Team<FootballPlayer>> footBallLeague = new League<Team<FootballPlayer>>("ACL");
		Team<FootballPlayer> Aeros = new Team<>("Aeros");
		Team<FootballPlayer> Bucks = new Team<>("Bucks");
		Team<FootballPlayer> Champs = new Team<>("Champs");
		Team<FootballPlayer> Danes = new Team<>("Danes");
		
		footBallLeague.add(Aeros);
		footBallLeague.add(Bucks);
		footBallLeague.add(Champs);
		footBallLeague.add(Danes);
		
		Aeros.matchResult(Champs, 10, 1);
		Bucks.matchResult(Champs, 45, 155);
		
		
		
		
		
	}
}
