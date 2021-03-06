package com.sync.ch2_1_1;

/**
 * @ClassName: HasSelfPrivateNum
 * @Description: 2.1.1 方法内部的私有变量是线程安全的
 * @author dongzhou
 * @date 2018年2月2日 下午5:46:43
 */
class HasSelfPrivateNum {

	public void addI(String username) {
		try {
			int num = 0;
			if (username.equals("a")) {
				num = 100;
				System.out.println("a set over");
				Thread.sleep(2000);
			} else {
				num = 200;
				System.out.println("b set over");
			}
			System.out.println(username + " num =" + num);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
