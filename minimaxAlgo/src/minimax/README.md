##MINIMAX Algorithm

INTRODUCTION

	Minimax algorithm is an Artificial Intelligence(AI) algorithm, It not only thinks about a single move but thinks of all the move till it gets a terminal point(end of the game). This algorithm creates a game tree whose each leaf is 		 		 
    given points and these points make it possible to find an optimal move and this we will see in our working section.
	The algorithm is used for making moves in a two-player game where player plays alternatively. This algorithm is a kind of backtracking algorithm. The algorithm gives the optimal move according to the state of the game. 
	For making an optimal move, the algorithm assumes that the opponent player plays optimally and plays with the intention of winning the game.
	The algorithm is named minimax because the algorithm categorizes its player in two categories- one is a maximizer and other one is a minimizer.
	Maximizer has that player's move whose move is to be optimally selected. Maximizer tries to maximize that move which is associated with it.
	Minimizer is just the opposite of maximizer. It has that alternative player's move. Minimizer tries to minimize the move of the maximizer.
	
	Consider the below example --->
			You and your friend are playing a tic-tac-toe game and the game is in some state. And now it's your turn. So you will make your move such that it is maximized which means that you will search for a move either 		 
    	        provides you the victory or makes it difficult for your friend to win in the coming move.
	                So, at your point of view, you are maximizing the move so you are the maximizer but with your friend's point of view you are minimizing the move and hence you are the minimizer.

Game Graph

    Maximizer turn ---->                                        (A)
                                                             /       \
                                                           /          \      
                                                          /            \
    Minimizer turn ---->                              (B)(+6)	    (C)(+4)       
                                                     /   \             /   \
                                                    /     \           /     \
                                                   /       \         /       \
    Maximizer turn ---->                         (D)(+6)   (E)(+1)  (F)(-4)   (G)(+4)
                                               /    \     /   \    /   \     /   \  
    Terminal Stage ---->                    |+6|  |+2|  |-3| |+1| |-4| |-8| |+4| |-1|
    
    
    In this graph, A,B,C,D,E,F,G are the states of a game with their points.
    So, when their is the turn of maximizer it will chose the bigger of two while minimizer will chose the smaller of two.