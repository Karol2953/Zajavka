package Enum;

public enum Example implements Voicable {
    REINDER("Hello Im Reinder"){
        @Override
        public String sing(){
            return "We are singing";
        }
    },
    SHARK("Im Shark"){
        @Override
        public String sing(){
            return "We are singing";
        }
    },
    CROCODILE("Im crocodile"){
        @Override
        public String sing(){
            return "We are singing";
        }
    },
    FROG("im frog"){
        @Override
        public String sing(){
            return "We are singing";
        }
    },
    GIRAFFE("im giraffe"){
        @Override
        public String sing(){
            return "We are singing";
        }
    };

    private final String massage;

    private Example(String massage) {
        this.massage = massage;
    }

    public String getMassage() {
        return massage;
    }

    @Override
    public String giveVoice() {
        return this.massage;
    }

    public abstract String sing();
}

