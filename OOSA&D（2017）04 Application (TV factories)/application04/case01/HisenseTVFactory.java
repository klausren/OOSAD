package assignments.factory.case01;

public class HisenseTVFactory implements TVFactory
{
    public TV produceTV()
    {
    	System.out.println("���ŵ��ӻ������������ŵ��ӻ���");
    	return new HisenseTV();
    }
}