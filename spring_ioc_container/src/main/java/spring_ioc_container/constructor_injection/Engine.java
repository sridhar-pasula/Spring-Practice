package spring_ioc_container.constructor_injection;

public class Engine {
	private String hp;
	private String dom;
	public Engine(String hp, String dom) {
		super();
		this.hp = hp;
		this.dom = dom;
	}
	
	public void engineDetails() {
		System.out.println(hp);
		System.out.println(dom);
	}

}
                                         