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

void* Event::getState() const{
    return this->_state;
}

void Event::setState(void* args){
	this->_state = args;
	this->notify();
}

void Event::attach(Handler* handler){
    _handlers->push_back(handler);
}

void Event::detach(Handler* handler){
    _handlers->remove(handler);
}

void Event::notify(){
	// TODO inserire politica di scheduling omp!
	list<Handler*>::iterator it;
	for(it = _handlers->begin(); it != _handlers->end(); it++){
		(*it)->update(this->getState());
	}
}
