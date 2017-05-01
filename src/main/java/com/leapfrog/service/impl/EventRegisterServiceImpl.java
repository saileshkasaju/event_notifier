package com.leapfrog.service.impl;

import com.leapfrog.model.EventRegister;
import com.leapfrog.repository.EventRegisterRepository;
import com.leapfrog.service.EventRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Edge on 5/1/2017.
 */
@Service("eventRegisterService")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class EventRegisterServiceImpl implements EventRegisterService {

    private EventRegisterRepository eventRegisterRepository;

    public EventRegisterServiceImpl() {
    }

    public EventRegisterServiceImpl(EventRegisterRepository eventRegisterRepository) {
        this.eventRegisterRepository = eventRegisterRepository;
    }

    @Autowired
    public void setEventRegisterRepository(EventRegisterRepository eventRegisterRepository) {
        this.eventRegisterRepository = eventRegisterRepository;
    }

    @Override
    public List<EventRegister> findAll() {
        return eventRegisterRepository.findAll();
    }
}
