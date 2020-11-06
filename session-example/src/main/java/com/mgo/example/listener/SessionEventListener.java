package com.mgo.example.listener;

import com.mgo.example.vo.UserVo;
import org.springframework.context.ApplicationListener;
import org.springframework.session.Session;
import org.springframework.session.events.SessionDeletedEvent;
import org.springframework.stereotype.Component;

/**
 * session事件监听器
 *
 * @author huaijin
 */
@Component
public class SessionEventListener implements ApplicationListener<SessionDeletedEvent> {

    private static final String CURRENT_USER = "currentUser";

    public void onApplicationEvent(SessionDeletedEvent event) {
        Session session = event.getSession();
        UserVo userVo = session.getAttribute(CURRENT_USER);
        System.out.println("invalid session's user:" + userVo.toString());
    }
}
