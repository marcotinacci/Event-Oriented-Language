/* 
 * File:   Event.cpp
 * Author: Marco Tinacci
 * 
 * Created on 6 giugno 2011, 17.05
 */

#include "Event.h"

Event::Event() {
    _handlers = new list<Handler*>();
}

Event::~Event() {
    delete _handlers;
}

int Event::getState(){
    return this->state;
}

void Event::setState(int s){
    this->state = s;
}

void Event::attach(Handler* handler){
    _handlers->push_back(handler);
}

void Event::detach(Handler* handler){
    _handlers->remove(handler);
}

void Event::notify(){
	list<Handler*>::iterator it;
	for(it = _handlers->begin(); it != _handlers->end(); it++){
		(*it)->update(1);
	}
}