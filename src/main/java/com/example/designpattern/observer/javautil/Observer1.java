package com.example.designpattern.observer.javautil;

import lombok.extern.slf4j.Slf4j;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by jingbin on 2016/10/21.
 * <p>
 * 最后是我们的使用者：
 */
@Slf4j
public class Observer1 implements Observer {

    public void registerSubject(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof SubjectFor3d) {
            SubjectFor3d subjectFor3d = (SubjectFor3d) o;
            log.info("SubjectFor3d:subjectFor3d's msg -- >" + subjectFor3d.getMsg());

//            Toast.makeText(PatternApplication.getInstance(), "subjectFor3d's msg -- >" + subjectFor3d.getMsg(), Toast.LENGTH_SHORT).show();
        }
        if (o instanceof SubjectForSSQ) {
            SubjectForSSQ subjectForSSQ = (SubjectForSSQ) o;
            log.info("SubjectForSSQ:subjectForSSQ's msg -- >" + subjectForSSQ.getMsg());

//            Toast.makeText(PatternApplication.getInstance(), "subjectForSSQ's msg -- >" + subjectForSSQ.getMsg(), Toast.LENGTH_SHORT).show();
        }
    }
}
