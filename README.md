# Sport Competitions Management



> The project was built in Java


### `Description `
---
A program that uses javafx and the MVC pattern to manage the cup competition. The program offers 3 options
To choose the type of sport:
- Tennis 
- Basketball 
- Soccer

The user can choose one of the competition types with the help of radio buttons. In any case of choosing the type of competition, the user must enter the names of the 8 participants using the "Add Participant" button. These names can be names of people or groups. The names will be registered in the participant boxes automatically in the order they are added.


### `How It Works` 
---

1. After clicking on the "Start Championship" button and provided that the user has filled in all the names, a second screen will appear (possibly in the same window) that allows for a round of quarter-final, semi-final and final games to be held. The game data can only be entered if the participants are known. For example, if the game of Quarter-final not finished It is not possible to enter the data of a semi-final game in which the names of the two participants are not yet known.

2. After clicking the "Play" button, a window will open to receive the game data.
This window depends on the type of competition selected.
- In a tennis competition there will be 3 or 5 sets when a difference of 3 wins is required (it can be 3-0,4-1) or 5 sets when there are 3 vs. 2 wins.
- In a basketball competition, the results of 4 quarters of the game are recorded.
- In a soccer competition, results of 2 halves are recorded and if the result is a draw, a result of one half is recorded
another one. If the result is still a draw, the results of the penalty kicks are taken.

3. After clicking the "Done" button, the winner of the game goes to the next stage of the competition and his name is recorded in the next game participants box. At the end of the competition, the winner of the competition will be announced.



<img width="886" alt="Screenshot 2022-12-22 at 10 25 08" src="https://user-images.githubusercontent.com/72464761/209090676-d958dc84-a647-4225-bdc6-f9c5b4510068.png">


<img width="866" alt="Screenshot 2022-12-22 at 10 25 23" src="https://user-images.githubusercontent.com/72464761/209090690-b2cff596-8c31-4de7-86e4-649277c85977.png">


<img width="866" alt="Screenshot 2022-12-22 at 10 25 35" src="https://user-images.githubusercontent.com/72464761/209090758-9902cc6b-4bc2-43c1-bcd3-8a22ff0630d7.png">
