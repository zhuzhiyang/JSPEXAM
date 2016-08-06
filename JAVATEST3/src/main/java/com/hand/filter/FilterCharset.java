package com.hand.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class FilterCharset
 */
public class FilterCharset implements Filter {

	private String charset=null;
    /**
     * Default constructor. 
     */
    public FilterCharset() {
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
			charset=fConfig.getInitParameter("encoding");
			if(charset==null)
			{
				throw new ServletException("EncodingFilter涓殑缂栫爜璁剧疆涓虹┖锛侊紒锛�");
			}
		
	}
	

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		if(!charset.equals(request.getCharacterEncoding()))
		{
			//System.out.println(charset);
			//System.out.println(request.getCharacterEncoding());
		  request.setCharacterEncoding(charset);
	
		}
		response.setCharacterEncoding(charset);
		chain.doFilter(request, response);	
	}
	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}


}
