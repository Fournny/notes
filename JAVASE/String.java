����JAVA�е� String
String �� final ���Ρ�Ҳ����˵���ܼ̳и��ࡣ�������ܸ�д����Ĺ���
String s = "abc";
	|--s��һ�������ͱ�������abc����һ�������ַ��������ص㣬һ������ʼ���ɹ����Ͳ����Ա��ı䡣
String �าд  Object ���е�equals�������÷��������ж��ַ����Ƿ���ͬ��
String �������������ַ��������ô�����ṩ�˶���������ַ������в������ص���Ƿ��������ա�
-----------------------------------------------------------------------------------------------
String ���÷���
	Sring s = new String();
'��ȡ'
s.charAt(2);
	|--����s�ַ����нǱ�Ϊ2���ַ�(char)��
s.length();	
	|--����s�ַ����ĳ���(int)!
s.indexOf('x');
	|--����x�ַ�,�����ַ�����'��һ�γ���'��λ��(int)!
s.indexOf("x",3);
	|--��s�ַ����ĵ�����λ�ÿ�ʼ�����ַ�x�������������ڵ�λ��(int)!(�����淽�����ɺ�������)
s.indexOf("xx");
	|--��s�ַ����з���xx�ַ�����λ��(int);
s.lastIndexOf('x');
	|--���ַ���s�У��������x�ַ�������������λ��(int);���x�� ""Ҳ���ǿա���ô���صľ�������ַ����ĳ��ȣ���length();һ����
s.lastIndexOf("xx");
	|--���ַ���s�У��������xx�ַ���������������λ��(int);
'�ж�'
s.isEmpty();
	|--�ж��ַ���s�ǲ���һ�����ַ���(boolean);
s.endsWith("x");
	|--�ж��ַ���s�ǲ�����x�ַ���β(boolean)-�Դ�Сд����;
s.startsWith("x");
	|--�ж��ַ���s�ǲ�����x�ַ���ͷ(boolean)-�Դ�Сд����;
s.contains("xx");
	|--�ж��ַ���s�ǲ��ǰ����ַ�"xx"(boolean)-�Դ�Сд����;
s.equals(s1);
	|--�ж��ַ���s��s1�ַ����������Ƿ���ͬ(boolean)(��д�� Object ���equals����);
s.equalsTgnoreCase(s1);
	|--���Դ�Сд�Ƚ�s��s1���ַ����Ƿ���ͬ;
'ת��'
���캯�����Ѿ��߱�����ת������
String s = new String(x);
	|--����'������x'ת����s�ַ�����
String s = new String(x,0,3);
	|--���ַ�����x��.0�Ǳ�λ�ÿ�ʼ'ȡ3���ַ�'��ת�����ַ���s��
String s = String.valueOf(x);
	|--��Xת�����ַ���
��������
s.toCharArray();
	|--���ַ���sת��������(char[]);
String.valueOf(x);[static]
	|--��xת�����ַ�����x�����Ƕ�����������(int,boolean,long....)(String);
s.toUpperCase();
	|--��s�ַ���ȫ��ת���ɴ�д���ҷ����µ��ַ���(String);
s.toLowerCase();
	|--��s�ַ���ȫ��ת�г�Сд���ҷ����µ��ַ���(String);
'�滻'
s.replace(x,y);
	|--���ַ���s������'x�ַ�',ȫ������'y�ַ�'��������һ���µ��ַ���(String)������滻���ַ������ڡ����Ƿ���ԭ��;
s.replace(x,y);
	|--���ַ���s�еĵ�'x�ַ���',ȫ���滻��'y�ַ���'��������һ���µ��ַ���(String)������滻���ַ��������ڡ����Ƿ���ԭ����
'�и�'
s.split(x);
	|--���ַ���s�������иֻҪ�����ַ���x���и�һ�Ρ�����һ���ַ������͵�����,������x(String[]);
s.split(x,num);
	|--�и��ַ�����num�и�Ĵ�����Ҳ��������ɷ��ص� String ��������Ǳꡣ 
'�Ӵ�'
s.substring(x,y);
	|--��s�ַ�����x�Ǳ꿪ʼ��y�Ǳ����(������y)�����û��y���ǵ���β������һ���µ��ַ���������(String);
	����Ǳ겻���ڻᷢ���Ǳ�Խ����쳣��
'ȥ��'
s.trim();
	|--ȥ��s�ַ������˵Ŀո�󣬲�����(String);
s.conmpareTo(s1)
	|--�������ַ���������Ȼ˳��ıȽ�.���s1����s�Ļ����ͷ���0.��� s1>s ���ظ���.��� s1<s ����һ������(����0)(int);
	�ȽϷ�������ASCII�����
--------------------------------------------------------------
StringBuffer b = new StringBuffer();
StringBuffer
	|--
b.append(x);
	|--��b�ַ�������׷��һ���ַ���x��
--------------------------------------------------------StringBuffer--------------------
����JAVA�� StringBuffer �ʺ϶��߳�
���������߳�ͬ������ȫ
StringBuffer ���ַ�����������һ�����������ҳ����ǿɱ仯�ġ�
1,�������ĳ����ǿɱ�ġ�
2,���Բ�������������͡�
3,���ջ�ͨ��toString��������ַ�����
�����������������Ͳ�ȷ������������ȷ�������Ҫ����ַ���ʹ�õġ��Ϳ��Կ���ʹ�û�������
����Ϊ���ݵĴ洢��һ����Ϊ���������toString����ַ���ʹ�á�
StringBuffer sb = new StringBuffer();
�ٴ洢
sb.append(x);	�����������󲿷����غ���
	|--��ָ��������,x,���ӵ��������ݵĽ�β�������صĻ��Ǳ������(StringBuffer);
sb.insert(1,x);	�����������󲿷����غ���
	|--��ָ��������x,���뵽sb��1�Ǳ�λ�á�������������졣���Ƿ��ظ������(StringBuffer);
���x�Ǳ겻���ڡ����е�ʱ�����ֽǱ�Խ�硣
��ɾ��
sb.delete(x,y);
	|--ɾ����������x - yλ�õ����ݣ�����x������y�����صĻ��Ǹ������(StringBuffer);
sb.deleteCharAt(x);
	|--ɾ��������ָ��λ�á�x�������ݡ����صĻ��Ǹ������(StringBuffer);
�ۻ�ȡ
sb.charAt(x);
	|--ͨ���Ǳ��ȡ�ַ�����
sb.indexOf(x)
	|--ͨ���ַ�����ȡλ�á�
sb.substring(x,y);
	|--��x��ʼy������������y�����ص���һ��String(String)��
sb.getChars(x,y,chs,z);
	|--��sb��������x��y�����ݡ���ŵ�chs��������,��zλ�ÿ�ʼ��š�
���������е�ָ������(����ͷ������β)���洢��ָ�������С�
���޸�
sb.replace(x,y,str);
	|--�����������x��ʼ��y����(������y)�������滻��str(StringBuffer);
sb.setCharAt(x,str);
	|--����������xλ�õ������滻��str��û�з���ֵ������������¶�(void);
�ݷ�ת
sb.reverse();
	|--��ת�������������صĻ��Ǹ������(StringBuffer);
-----------------------------------------------------------------------------------------------
����JAVA�� StringBuilder  �ʺϵ��̣߳������ҪӦ���ڶ��̡߳���Ҫ�Լ�����  synchronized 
���������̲߳�ͬ�����̲߳�һ����ȫ��
��JDK1.5�汾(����)֮��ų����� StringBuilder ��