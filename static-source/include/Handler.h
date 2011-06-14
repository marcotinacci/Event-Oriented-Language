/* 
 * File:   Handler.h
 * Author: Marco Tinacci
 *
 * Created on 6 giugno 2011, 17.14
 */

#ifndef _HANDLER_H
#define	_HANDLER_H

#include "Event.h"

using namespace std;

class Event;

class Handler {
public:
    Handler();
    ~Handler();
    virtual void update(void* args) = 0;
	void setEvent(Event* e);
    Event* getEvent() const;
private:
    Event* _event;
};

#endif	/* _HANDLER_H */
