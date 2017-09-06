package com.wzy.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


/*
ʹ�ó���

1����־��¼����¼������Ϣ����־���Ա������Ϣ��ء���Ϣͳ�ơ�����PV��Page View���ȡ�
2��Ȩ�޼�飺���¼��⣬���봦����������Ƿ��¼�����û��ֱ�ӷ��ص���¼ҳ�棻
3�����ܼ�أ���ʱ��ϵͳ��ĳ��ʱ��Ī���������������ͨ���������ڽ��봦����֮ǰ��¼��ʼʱ�䣬�ڴ�������¼����ʱ�䣬�Ӷ��õ�������Ĵ���ʱ�䣨����з������
                           ��apache�����Զ���¼����
4��ͨ����Ϊ����ȡcookie�õ��û���Ϣ�����û�����������󣬴Ӷ������������ʹ�ã���������ȡLocale��Theme��Ϣ�ȣ�ֻҪ�Ƕ������������Ҫ�ļ���ʹ��������ʵ�������������֡�
5��OpenSessionInView����Hibernate���ڽ��봦������Session������ɺ�ر�Session��

   ����Ҳ��AOP�����������̣���Ҳ����˵���Ϻ��й�ע������й��ܶ����Է���������ʵ�֡�

*/


public class LoginInterceptor implements HandlerInterceptor {

	
	/*
	������������ϻص�������������ͼ��Ⱦ���ʱ�ص��������ܼ�������ǿ����ڴ˼�¼����ʱ�䲢�������ʱ�䣬�����Խ���һЩ��Դ����
	������try-catch-finally�е�finally���������ô�����ִ������preHandle����true����������afterCompletion��
	*/
	
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {

		
	}
	
	
	/*	
	����ص�������ʵ�ִ������ĺ���������Ⱦ��ͼ֮ǰ����
	��ʱ���ǿ���ͨ��modelAndView��ģ�ͺ���ͼ���󣩶�ģ�����ݽ��д�������ͼ���д���
	modelAndViewҲ����Ϊnull��	
	*/
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {

	}

	
	/*	
	Ԥ����ص�������ʵ�ִ�������Ԥ����
	true��ʾ�������̣��������һ����������������
	false��ʾ�����ж�.��Ҫͨ��response��������Ӧ
	*/
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {

		
		return true;
	}
	
	
	  

}
