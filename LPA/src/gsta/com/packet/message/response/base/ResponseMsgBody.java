package gsta.com.packet.message.response.base;

import gsta.com.packet.message.MsgBody;
/**
 * 响应消息体<抽象类>
 *
 * @author baojw@whty.com.cn
 * @date 2014年10月11日 下午3:01:12
 */
public abstract class ResponseMsgBody implements MsgBody {
	private HeaderResp header;

	public HeaderResp getHeader() {
		return header;
	}

	public void setHeader(HeaderResp header) {
		this.header = header;
	}

	
}

	