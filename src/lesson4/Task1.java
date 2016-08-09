package lesson4;

// ��������
// �������� ������
// ��������� fact(n) = n*fact(n-1)
// ���������� � ������� pow (n,m) ������� n^m = n*n^m-1

public class Task1 {
	public static void main(String[] args) {
//		f(0, 5);
		System.out.println(sum(1,5));
		
	}

	public static void f(int count, int limit) {

		System.out.println(count);
		if (count == limit) {
			return;
		}
		f(count + 1, limit);
		System.out.println(count);

	}
	
	public static int sum (int start, int end){
		if (start==end){
			return end;
		}
		int recResult = sum (start+1, end);
		int res = start+recResult;
		return res;
		
	}

}
