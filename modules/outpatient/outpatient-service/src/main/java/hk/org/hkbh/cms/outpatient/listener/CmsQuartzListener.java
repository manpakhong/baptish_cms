package hk.org.hkbh.cms.outpatient.listener;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageListener;
import com.liferay.portal.kernel.messaging.MessageListenerException;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CmsQuartzListener implements MessageListener {
	private static Log log = LogFactoryUtil.getLog(CmsQuartzListener.class);

	@Override
	public void receive(Message message) throws MessageListenerException {

		Date currentDate = new Date();
		SimpleDateFormat dateFomat = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
		log.info("This is CmsQuartzListener - " + dateFomat.format(currentDate));

	}

}
