package assignments.factory.case01;

public class HaierTVFactory implements TVFactory
{
    public TV produceTV()
    {
    	System.out.println("�������ӻ����������������ӻ���");
    	return new HaierTV();
    }
}