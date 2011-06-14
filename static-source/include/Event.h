/* 
 * File:   Event.h
 * Author: Marco Tinacci
 *
 * Created on 6 giugno 2011, 17.05
 */

#ifndef _EVENT_H
#define	_EVENT_H

#include <list>
#include "Handler.h"

using namespace std;

class Handler;

class Event {
public:
    Event();
    ~Event();
    void* getState() const;
    void setState(void* args);
    void attach(Handler* handler);
    void detach(Handler* handler);
    void notify();
private:
    list<Handler*>* _handlers;
    void* _state;
};

#endif	/* _EVENT_H */
