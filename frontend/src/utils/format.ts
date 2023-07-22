export const round = (value: number, precision: number) => {
    // eslint-disable-next-line no-var
    var multiplier = Math.pow(10, precision || 0);
    return Math.round(value * multiplier) / multiplier;
}