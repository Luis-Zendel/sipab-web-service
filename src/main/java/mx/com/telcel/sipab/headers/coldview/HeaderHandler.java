package mx.com.telcel.sipab.headers.coldview;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.namespace.QName;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import jakarta.xml.soap.SOAPMessage;
import jakarta.xml.ws.handler.MessageContext;
import jakarta.xml.ws.handler.soap.SOAPHandler;
import jakarta.xml.ws.handler.soap.SOAPMessageContext;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class HeaderHandler implements SOAPHandler<SOAPMessageContext> {
	
	ByteArrayOutputStream stream = new ByteArrayOutputStream();

	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		Boolean outboundProperty = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		try {
			if (outboundProperty) {
				Map<String, List<String>> headers = new HashMap<String, List<String>>();
				context.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
				SOAPMessage message = context.getMessage();
				message.writeTo(stream);
				log.info(stream);
				stream.close();
			} else {
				SOAPMessage message = context.getMessage();
				message.writeTo(stream);
				log.info(stream);
				stream.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return outboundProperty;
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void close(MessageContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<QName> getHeaders() {
		// TODO Auto-generated method stub
		return null;
	}

}
