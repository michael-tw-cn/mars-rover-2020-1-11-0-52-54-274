# tasking



1. should_initialized_when_execute_InitializeCommand

given: N
when: turn_left
then: W

given: N
when: turn_right
then: E

given: E
when: turn_left
then: N

given: E
when: turn_right
then: S

given: S
when: turn_left
then: E

given: S
when: turn_right
then: W

given: W
when: turn_left
then: S

given: W
when: turn_right
then: N


given: (0,0), N
when: M
then: (1, 0)

given: (0, 0), S
when: M
then: (-1, 0)

given: (0, 0), W
when: M
then: (0, -1)

given: (0, 0), E
when: M
then: (0, 1)
