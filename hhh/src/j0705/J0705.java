package j0705;

public class J0705 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book=new Book();
		book.setTitle("JAVA �Ӽ�");
		book.setAuthor("������");
		book.setPage(786);
		System.out.println(book.getPage());
		
		Book book2=new Book("JAVA,��,������","�̺���",564);
		System.out.println(book2);
	}

}
//����,�޼���
//�ν��Ͻ�,Ŭ����
//�����ڸ޼���
//�ν��Ͻ�����,Ŭ���� �����ʱ�ȭ
//�����ε�
//�������̵�
//���
//������
//������
//�߻�ȭ
//�������̽�
//����Ŭ����(�͸�Ŭ����,����Ŭ����)
//������
//
//�÷���-�ڷᱸ���� �˰���
//	- collection,List,Map Set
//	-ArrayList,Vector,LinkedList,
//	-Queue,stack,HashSet,TreeSet
//	-HashMap,treeMap ���

//���׸�
//�ֳ����̼�
//��Ʈ��
//������