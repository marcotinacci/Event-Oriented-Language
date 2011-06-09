/* 
 * File:   Event.h
 * Author: Marco Tinacci
 *
 * Created on 6 giugno 2011, 17.05
 */

#ifndef _EVENT_H
#define	_EVENT_H

#include <list>
#include <iostream>
#include "Handler.h"

using namespace std;

class Handler;

class Event {
public:
    Event();
    ~Event();
    int getState();
    void setState(int s);
    void attach(Handler* handler);
    void detach(Handler* handler);
    void notify();
private:
    list<Handler*>* _handlers;
    int state;
};

#endif	/* _EVENT_H */

