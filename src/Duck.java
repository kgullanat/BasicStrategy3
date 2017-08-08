
public abstract class Duck {
	Flybehavior flybehavior;//ตัวแปรคลาส Flybehavior
	Quackbehavior quackbehavior;//ตัวแปรคลาส Quackbehavior
	void performQuack(){
		quackbehavior.quack();
	}
	void setQuackBehavior (Quackbehavior qb){
		quackbehavior = qb;
	}
	void performFly(){
		flybehavior.fly();
	}
	void swim(){
		System.out.println("I'm swimming");
	}
	abstract void display();
	void setFlybehavior(Flybehavior fb){
		flybehavior = fb;
	}
}
