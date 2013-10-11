package desperatehousepi;

import java.util.Random;

public class Crust extends Person {
	//Object Declarations
	PTrait warmth = new PTrait(0);
	PTrait reasoning = new PTrait(0);
	PTrait emotionalStability = new PTrait(0);
	PTrait dominance = new PTrait(0);
	PTrait liveliness = new PTrait(0);
	PTrait ruleConsciousness = new PTrait(0);
	PTrait socialBoldness = new PTrait(0);
	PTrait sensitivity = new PTrait(0);
	PTrait vigilance = new PTrait(0);
	PTrait abstractedness = new PTrait(0);
	PTrait privateness = new PTrait(0);
	PTrait apprehensivness = new PTrait(0);
	PTrait opennessToChange = new PTrait(0);
	PTrait selfReliance = new PTrait(0);
	PTrait perfectionism = new PTrait(0);
	PTrait tension = new PTrait(0);
	
	// Crust constructor to generate Crust with completely random Personality Traits
	Crust(){
		warmth = setRandomTrait();
		reasoning = setRandomTrait();
		emotionalStability = setRandomTrait();
		dominance = setRandomTrait();
		liveliness = setRandomTrait();
		ruleConsciousness = setRandomTrait();
		socialBoldness = setRandomTrait();
		sensitivity = setRandomTrait();
		vigilance = setRandomTrait();
		abstractedness = setRandomTrait();
		privateness = setRandomTrait();
		apprehensivness = setRandomTrait();
		opennessToChange = setRandomTrait();
		selfReliance = setRandomTrait();
		perfectionism = setRandomTrait();
		tension = setRandomTrait();
	}
	
	/************************************************
	 * Function creates random base value between -100 and 100 for PTrait
	 * @author Anthony and Michael
	 * @return PTrait with base value randomly set
	 ************************************************/
	private PTrait setRandomTrait(){
		PTrait trait = new PTrait(0);
		Random rand = new Random();
		int newTraitValue = rand.nextInt(201)-100;
		trait.setBase(newTraitValue);
		return trait;
	}
}


