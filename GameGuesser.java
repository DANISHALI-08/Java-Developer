package com.corejava.service;
import java.util.*;

class Guesser{
	int guessNum;
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Guesser,Kindly guess the Num bhelow 10");
		guessNum=scan.nextInt();
		
		while(guessNum > 10)
		{
			System.out.println("number is greater than 10, please enter again");
			guessNum=scan.nextInt();
			if(guessNum <= 10)
			{
				break;
			}
		}
		return guessNum;
	}
}

class Player{
	int guessNum;
	int guessNum(String num)
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Player " +num +" ,Kindly guess the Num. below 10");
	guessNum=scan.nextInt();
	
	while(guessNum > 10)
	{
		System.out.println("number is greater than 10, please enter again");
		guessNum=scan.nextInt();
		if(guessNum <= 10)
		{
			break;
		}
	}
	
	return guessNum;
	}
}


class Umpire
{
int numFromGuesser;
int numFromPlayer1;
int numFromPlayer2;
int numFromPlayer3;

void CollectnumFromGuesser()
{
	Guesser g=new Guesser();
	numFromGuesser=g.guessNum();
	
}

void CollectnumFromPlayer()
{
Player p1=new Player();
Player p2=new Player();	
Player p3=new Player();

numFromPlayer1=p1.guessNum("one");
numFromPlayer2=p2.guessNum("two");
numFromPlayer3=p3.guessNum("three");

}
void compare()
{
	int count = 0;
	if(numFromGuesser==numFromPlayer1)
	{
		System.out.println("Player 1 won the game");
		count++;
	}
	if(numFromGuesser==numFromPlayer2)
	{
		System.out.println("Player 2 won the game");
		count++;
	}
	if(numFromGuesser==numFromPlayer3)
	{
		System.out.println("Player 3 won the game");
		count++;
	}
	if(count == 0)
	{
		System.out.println("All Player lost the game");
	}
	}
}



public class GameGuesser {

	public static void main(String[] args) {
		Umpire u=new Umpire();
		u.CollectnumFromGuesser();
		u.CollectnumFromPlayer();
		u.compare();

	}

}
