class __HANDLERCLASSNAME__ : public Handler {
private:
	__MODULECLASSNAME__ *module;
public:
	__HANDLERCLASSNAME__(__MODULECLASSNAME__ *m) {
		module = m;
	}
    ~__HANDLERCLASSNAME__() {}
    void update(void* args){
	/*
	 * Downcast of parameters from void* args
	 */
    __HANDLERPARAMSCAST__
	/*
	 * Handler's body
	 */
	__HANDLERBODY__
	}
};
