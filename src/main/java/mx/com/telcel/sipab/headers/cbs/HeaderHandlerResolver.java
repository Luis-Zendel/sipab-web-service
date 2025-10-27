package mx.com.telcel.sipab.headers.cbs;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.ws.handler.Handler;
import jakarta.xml.ws.handler.HandlerResolver;
import jakarta.xml.ws.handler.PortInfo;

public class HeaderHandlerResolver implements HandlerResolver{

	@Override
	public List<Handler> getHandlerChain(PortInfo portInfo) {
		List<Handler> handlerChain = new ArrayList<Handler>();

		HeaderHandler headerHandler = new HeaderHandler();

		handlerChain.add(headerHandler);

		return handlerChain;
	}

}
