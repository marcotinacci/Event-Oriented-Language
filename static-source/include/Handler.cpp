/* 
 * File:   Handler.cpp
 * Author: Marco Tinacci
 * 
 * Created on 6 giugno 2011, 17.14
 */

#include "Handler.h"

Handler::Handler() {};

Handler::~Handler() {}

void Handler::setEvent(Event* _event) {
    this->_event = _event;
}

Event* Handler::getEvent() const {
    return _event;
}

void Handler::update(int arg){
    cout << "Update arg = " << arg << endl;
}