class Group {
	//属性
	public String name;
	public int num;
	
	//构造方法(初始化)

	public Group(String n, int m) {
		this.name = n;
		this.num = m;
	}
	
}

class B {
	int sum;
	B(int a, int b, int c) {
		System.out.println(a+b+c);
		sum = a + b + c;
	}
	void print() {
		System.out.println(sum);
	}
}

public class classLearn {
	public static void main(String[] args) {
		/*
		Group grp = new Group();
		grp.name = "比特Java10班";
		grp.num = 50;*/
		
		Group grp = new Group("比特Java10班", 50);
		
		System.out.println("欢迎来到比特,"+grp.name+"的"+grp.num+"位同学");
		
		B b = new B(1,2,3);
		b.print();
	}
}