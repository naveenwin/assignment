# Animal Model Assignment

This application is an simple solution to the problem of how to model the given different kinds of Animals witch has a constant changing behaviours.


## Functionality For Implementation

####  Can you implement the sing() method for the bird?
- How did you unit test it?
- How did you optimize the code for maintainability?
    - (Ask yourself the same question for all following exercises)

#### Now, we have 2 special kinds of birds: the Duck and the Chicken... Can you implement them to make their own special sound?
- A duck says: “Quack, quack”
- A duck can swim
- A chicken says: “Cluck, cluck”
- A chicken cannot fly (assumption: its wings are clipped but ignore that)

####  Now how would you model a rooster?
- A rooster says: “Cock-a-doodle-doo”
- How is the rooster related to the chicken?
- Can you think of other ways to model a rooster without using inheritance?

####  Can you model a parrot? We are specifically interested in three parrots, one that lived in a house with dogs one in a house with cats, the other lived on a farm next to the rooster.
- A parrot living with dogs says: “Woof, woof”
- A parrot living with cats says: “Meow”
- A parrot living near the rooster says: “Cock-a-doodle-doo”
- How do you keep the parrot maintainable? What if we need another parrotlives near a Duck? Or near a phone that rings frequently?

### Model fish as well as other swimming animals
####  In addition to the birds, can you model a fish?
- Fishes don’t sing
- Fishes don’t walk
- Fishes can swim

####  Can you specialize the fish as a Shark and as a Clownfish?
- Sharks are large and grey
- Clownfish are small and colourful (orange)
- Clownfish make jokes
- Sharks eat other fish

#### Dolphins are not exactly fish, yet, they are good swimmers
- Can you model a dolphin that swims without inheriting from a fish class?
- How do you avoid duplicating code or introducing unneeded overhead?

####  Model animals that change their behaviour over time
- Can you model a butterfly?
- A butterfly can fly
- A butterfly does not make a sound

####  Can you optimize your model to account for the metamorphosis from caterpillar to butterfly?
- A caterpillar cannot fly
- A caterpillar can walk (crawl)

####  Counting animals
Suppose you have an array of animals, e.g.
Animal[] animals = new Animal[]{
new Bird(),
new Duck(),
new Chicken(),
new Rooster(),
new Parrot(),
new Fish(),
new Shark(),
new Clownfish(),
new Dolhpin(),
new Frog(),
new Dog(),
new Butterfly(),
new Cat()
};
Note: The above instantiation may be different if you chose to set up your object model
differently… (hopefully you did)

####  Can you share the code to count:
1. how many of these animals can fly?
2. how many of these animals can walk?
3. how many of these animals can sing?
4. how many of these animals can swim?


### Assumptions

- It is understood that unless it is not specified then a particular behaviour is not done. For example if it is not specified explicitly that a Chicken can Walk then it cant walk. So no assumption done on this part
- It is understood that any behaviour can be added to any type of animals 

### Future improvements

- There are lot of improvements to be done in testing, There are no negative tests written. 
- Need to add Integration Tests and API testing
- This is not production ready code. Still need lot of improvements 

### API
- The application will start by default on port 8080
- The URL for getting animals based on behaviour. 
    - Ex: localhost:8080/animal/fly
    - Ex: localhost:8080/animal/swim
    - Ex: localhost:8080/animal/walk
    - Ex: localhost:8080/animal/sing
## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a system.

### Prerequisites

What things you need to install the software and how to install them

[Java 11](https://java.com/en/download/help/mac_install.xml)

[Maven 3.3](https://maven.apache.org/install.html)

### Installing

First run the command maven clean

```
mvn clean
```

Then Compile the project

```
mvn compile
```

Then package and install the project using

```
mvn package install
```

## Running the tests

Run all the unit test classes.

```
mvn test
```

## Deployment and Running

Once maven install is done a 'target' folder is generated with the project .jar file. It can be run using the command

This will accept the commands from the console
```
java -jar assignment-1.0.0.jar
```

Running jar by passing the commands from file
```
java -jar assignment-1.0.0.jar
```


## Sample Input





## Contact Information
Please report any bugs or issues to:
[navee.win1@gmail.com](mailto:naveen.win1@gmail.com)