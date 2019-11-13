package com.singtel.assignment.model.bird;

import com.singtel.assignment.behaviour.FlyBehaviour;
import com.singtel.assignment.behaviour.SoundBehaviour;
import com.singtel.assignment.behaviour.SwimBehaviour;
import com.singtel.assignment.behaviour.WalkBehaviour;
import com.singtel.assignment.model.Bird;

public class Chicken extends Bird {

    private Chicken() {
    }

    public static class ChickenBuilder {

        private WalkBehaviour walkBehaviour;
        private FlyBehaviour flyBehaviour;
        private SwimBehaviour swimBehaviour;
        private SoundBehaviour soundBehaviour;

        public ChickenBuilder buildWith(WalkBehaviour walkBehaviour) {
            this.walkBehaviour = walkBehaviour;
            return this;
        }

        public ChickenBuilder buildWith(FlyBehaviour flyBehaviour) {
            this.flyBehaviour = flyBehaviour;
            return this;
        }

        public ChickenBuilder buildWith(SwimBehaviour swimBehaviour) {
            this.swimBehaviour = swimBehaviour;
            return this;
        }

        public ChickenBuilder buildWith(SoundBehaviour soundBehaviour) {
            this.soundBehaviour = soundBehaviour;
            return this;
        }

        public Chicken build() {
            var chicken = new Chicken();
            if (this.swimBehaviour != null) {
                chicken.setSwimBehaviour(this.swimBehaviour);
            }
            if (this.flyBehaviour != null) {
                chicken.setFlyBehaviour(this.flyBehaviour);
            }
            if (this.soundBehaviour != null) {
                chicken.setSoundBehaviour(this.soundBehaviour);
            }
            if (this.walkBehaviour != null) {
                chicken.setWalkBehaviour(this.walkBehaviour);
            }
            return chicken;
        }
    }

    public static ChickenBuilder builder() {
        return new ChickenBuilder();
    }
}

